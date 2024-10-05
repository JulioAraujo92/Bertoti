package com.apiToDoList.demo.web.controller;

import com.apiToDoList.demo.entity.Task;
import com.apiToDoList.demo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("tasks")
@CrossOrigin(origins = "*")
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getTasks(){
        return ResponseEntity.ok().body(taskService.buscarTasks());
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.criarTask(task));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(taskService.buscarPorId(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        taskService.deletePorId(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/update")
    public ResponseEntity<Task> update(@RequestBody Task task){
        Task taskupdated = taskService.atualizar(task);
        return ResponseEntity.ok().body(taskupdated);
    }
}
