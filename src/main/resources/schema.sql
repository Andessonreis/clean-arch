-- Tabela para armazenar projetos
CREATE TABLE IF NOT EXISTS projects (
    id BIGINT PRIMARY KEY AUTO_INCREMENT, 
    projectName VARCHAR(255) NOT NULL, 
    projectDescription TEXT, 
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP 
);

-- Tabela para armazenar tarefas
CREATE TABLE IF NOT EXISTS tasks (
    id BIGINT PRIMARY KEY AUTO_INCREMENT, 
    project_id BIGINT NOT NULL, 
    title VARCHAR(255) NOT NULL, 
    description TEXT, 
    status ENUM('TODO', 'IN_PROGRESS', 'DONE') DEFAULT 'TODO', 
    dueDate DATE, 
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
    FOREIGN KEY (project_id) REFERENCES projects(id) 
);
