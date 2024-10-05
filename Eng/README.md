# <p align ="center"> Professor Bertoti - Engenharia de Software

## **Comentários do livro Software Engineering at Google**
"Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimeension to programming."
"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."

> A programação e engenharia de software pode se confudirem muito, já que a programação tem uma parte significativa da engenharia de software, pois é como o software é gerado inicialmente. Entretanto a programação é o desenvolvimento do softaware em si e a engenharia de software engloba três aspectos do software (desenvolvimento, modificação e manutenção).

> A engenharia de software é um passo muito importante no processo de desenvolvimentto de um software.  Em projetos de engenharia de software, os engenheiros precisam estar mais preocupados com o decorrer do tempo e a eventual necessidade de mudança. Em organizações de engenharia de software, a preocupação principal é com a escala e a eficiência, tanto para o software produzido quanto para a própria organização. Além disso, os engenheiros de software são desafiados a tomar decisões mais complexas com consequências de alto impacto, muitas vezes baseadas em estimativas imprecisas de tempo e crescimento. 

## **Três exemplos de tradeoffs**

**Escolha da Tecnologia** Ao desenvolver um aplicativo, optar por usar Flutter permite criar uma aplicação para ambos os sistemas IOS e Android com um único código base. No entanto, isso pode resultar em problemas de desempenho ou funcionalidade específicos para cada plataforma. Em contrapartida, escolher Kotlin para desenvolvimento Android pode proporcionar uma experiência mais otimizada para usuários Android, mas exigirá a criação de um aplicativo separado para iOS, o que pode aumentar o custo e a complexidade do desenvolvimento. Desenvolvimento de Aplicativos Web:

**Complexidade vs. Escalabilidade** Optar por sistemas mais simples e econômicos para desenvolver um aplicativo web pode ser vantajoso em termos de custos iniciais. No entanto, essa escolha pode resultar em limitações de escalabilidade, o que significa que o aplicativo pode não ser capaz de lidar com um grande número de usuários simultâneos. Para lidar com um tráfego crescente, pode ser necessário investir em atualizações significativas ou em uma mudança para uma arquitetura mais robusta. Sistema Operacional:

**Personalização vs. Facilidade de Uso:** O sistema operacional Linux oferece um alto nível de personalização e controle sobre o ambiente do computador, o que é ideal para usuários avançados e entusiastas de tecnologia. No entanto, essa mesma flexibilidade pode torná-lo menos amigável para pessoas com menos conhecimento técnico. Em contraste, sistemas operacionais como o Windows ou macOS são projetados com uma interface mais amigável, mas podem ser menos personalizáveis em comparação ao Linux. Portanto, a escolha entre eles envolve um trade-off entre personalização e facilidade de uso.


## **Análise dos requisitos não funcionais e tradeoffs das arquiteturas dos slides 24 à 29**

- **Arquitetura em camadas**
    - Pontos fortes: Baixo custo, simplicidade
    - Pontos fracos: Escalabilidade, tolerância ao erro
    - Tradeoff: As várias camadas pode introduzir sobrecarga devido à necessidade de comunicação entre as camadas, o que pode afetar o desempenho do sistema. 
    
- **Arquitetura pipeline**
    - Pontos fortes: Baixo Custo, simplicidade
    - Pontos fracos: Escalabilidade, tolerância ao erro
    - tradeoff: Por fazer uma atividade por vez a escalabilidade dela é ruim quando há muitas requisições

- **Arquitetura microkernel**
    - Pontos fortes: Performance, confiabilidade, testabilidade
    - Pontos fracos: Escalabilidade, tolerância ao erro
    - Tradeoff: É utilizado em sistemas operacionais.

- **Arquitetura baseada em serviços**
    - Pontos fortes: implantabilidade, tolerância ao erro, modularidade, custo total, confiabilidade, testabilidade
    - Pontos fracos: escalabilidade, simplicidade
    - tradeoff: Permite que diferentes partes de um sistema sejam independentes, modulares e escaláveis, facilitando a adaptação e a evolução do sistema ao longo do tempo. No entanto, essa abordagem também pode introduzir complexidade na comunicação entre os serviços.

- **Arquitetura Orientada a Eventos**
    - Pontos fortes: Desempenho, escalabilidade, tolerância ao erro
    - Pontos fracos: Simplicidades, testabilidade
    - tradeoff: Os eventos podem ser processados de forma distribuída e assíncrona por diferentes partes do sistema. Isso permite lidar com picos de carga e volumes massivos de eventos de forma eficiente. No entanto, essa abordagem pode introduzir desafios em termos de consistência dos dados. Em muitos casos, a consistência imediata dos dados não é garantida, o que pode levar a problemas de sincronização e garantia de integridade dos dados.

- **Arquitetura de Microsserviços**
    - Pontos fortes: Desempenho, escalabilidade, modularidade
    - Pontos fracos: Custo alto, simplicidade, desempenho
    - tradeoff: permite escalar cada serviço de forma independente, o que é altamente vantajoso para lidar com demandas variáveis e picos de tráfego em partes específicas de um sistema, porém acaba gerando uma complexidade muito elevada para o sistema e o custo consquentemente muito alto.


## **Classes UML**

![Imagem Classe UML](https://github.com/JulioAraujo92/Bertoti/blob/main/Classe_UML.jpg)

## **UML**
![Imagem UML](https://github.com/JulioAraujo92/Bertoti/blob/main/UML.jpg)

