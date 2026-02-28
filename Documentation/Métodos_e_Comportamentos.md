# Métodos e Comportamentos

## Objetivo

Este documento descreve as alterações realizadas na classe `Notebook`, incluindo a adição de novos métodos, aplicação de regras de negócio e proteção do estado do objeto conforme solicitado na missão.

---

## Alterações Realizadas

### 1️⃣ Encapsulamento

Os atributos da classe foram alterados de `public` para `private` para proteger o estado interno do objeto.

### Antes:
```java
public String processador;
public String armazenamento;
public String os;
```

### Depois

```java
private String processador;
private String armazenamento;
private String os;
```

## Métodos Criados

### atualizarProcessador(String novoProcessador)

**Descrição:**
Atualiza o processador do notebook.

**Regra de Negócio:**

- O valor não pode ser null

- O valor não pode ser vazio

**Comportamento:**

- Se válido → altera o atributo

- Se inválido → exibe mensagem de erro
