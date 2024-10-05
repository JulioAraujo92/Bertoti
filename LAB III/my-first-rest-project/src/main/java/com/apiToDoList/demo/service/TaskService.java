package com.apiToDoList.demo.service;

import com.apiToDoList.demo.entity.Task;
import com.apiToDoList.demo.exception.DataViolation;
import com.apiToDoList.demo.exception.EntityNotFoundException;
import com.apiToDoList.demo.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    @Transactional(readOnly = true)
    public List<Task> buscarTasks() {
        return taskRepository.findAll();
    }

    @Transactional
    public Task criarTask(Task task) {
        try{
            return taskRepository.save(task);
        }catch(org.springframework.dao.DataIntegrityViolationException ex){
            throw new DataViolation("Todos os campos são obrigatórios");
        }
    }

    @Transactional(readOnly = true)
    public Task buscarPorId(Long id){
        return taskRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(String.format("Não foi possível encontrar a task com o id %s.", id))
        );

    }
    @Transactional
    public void deletePorId(Long id) {
        Task task = buscarPorId(id);
        if(task!=null){
            taskRepository.deleteById(id);
        }
    }
    @Transactional
    public Task atualizar(Task task){
        Task taskFound = buscarPorId(task.getId());

        if(taskFound==null){
            throw new EntityNotFoundException(String.format("Entidade com o id %s não encontrado",task.getId()));
        }
        taskFound.setTitulo(task.getTitulo());
        taskFound.setDescricao(task.getDescricao());
        taskFound.setPrioridade(task.getPrioridade());
        return taskRepository.save(taskFound);
    }
}
