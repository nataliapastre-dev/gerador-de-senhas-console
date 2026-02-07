# 🔐 Gerador de Senhas Seguras em Java (Console)

Projeto desenvolvido em **Java (console)** para geração de senhas seguras e personalizadas.  
O usuário pode definir critérios de composição da senha e visualizar o **nível de segurança** da senha gerada.

Este repositório faz parte do meu **portfólio de estudos**, com foco em:
- Lógica de programação  
- Manipulação de strings  
- Aleatoriedade  
- Interação via terminal  

---

## 📌 Visão Geral

A aplicação solicita ao usuário:

- O **tamanho da senha**
- Quais **tipos de caracteres** devem ser incluídos

Com base nessas escolhas, o sistema gera uma senha aleatória e classifica seu **nível de segurança**.

---

## ✨ Funcionalidades

- Definição do tamanho da senha  
- Seleção de critérios:
  - Letras maiúsculas  
  - Letras minúsculas  
  - Números  
  - Símbolos  
- Geração de senha aleatória conforme os critérios escolhidos  
- Avaliação do nível de segurança da senha:
  - Muito Fraca  
  - Fraca  
  - Média  
  - Forte  
  - Muito Forte  

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- `Scanner` — entrada de dados via console  
- `Random` — geração aleatória de caracteres  
- `StringBuilder` — montagem eficiente da senha  

---

## ▶️ Como Executar o Projeto

### Pré-requisitos
- Java JDK 8 ou superior

### Passo a passo

Clone o repositório:
```bash
git clone https://github.com/nataliapastre-dev/gerador-de-senhas-console.git

## 📌 Exemplo de Execução

```text
=== Gerador de Senhas Seguras ===
Informe o tamanho da senha: 12
Incluir letras maiúsculas? (s/n): s
Incluir letras minúsculas? (s/n): s
Incluir números? (s/n): s
Incluir símbolos? (s/n): s

Senha gerada: A9f@K2#xQp!7
Nível de segurança: Muito Forte 💪


