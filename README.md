# **Universidade Tecnológica Federal do Paraná**

**Engenharia de Software - Curso de Arquitetura de Software (AS27S)**

**INSTRUTOR:** Prof. Dr. Gustavo Santos

**Aluno:** Gabriel Schmitt Teixeira, **RA:** 2580527

## **CCH - Design Patterns: Builder**

### **Problema**

Ao desenvolver sistemas complexos, muitas vezes é necessário criar objetos que possuem múltiplos atributos opcionais. O uso de construtores tradicionais pode levar a código difícil de ler e manter, especialmente quando há muitas combinações possíveis de parâmetros. Além disso, o uso de setters pode comprometer a imutabilidade do objeto e permitir estados inconsistentes.

### **Descrição da Solução**

O padrão de projeto **Builder** resolve esse problema ao fornecer um mecanismo para construir objetos passo a passo, garantindo que sejam criados de forma consistente e legível. O Builder encapsula a lógica de construção dentro de uma classe separada, permitindo um código mais modular e flexível.

### **Visão Geral**

A implementação do **Builder** consiste em:

1. **Uma classe principal (`Computer`)** com atributos privados e um construtor privado.
2. **Uma classe interna (`Builder`)** responsável por definir os atributos e criar o objeto final.
3. **Métodos encadeáveis**, permitindo configurar os atributos do objeto de maneira fluida.

### **Exemplo de Código disponível em ComputerBuilder.java**

### **Consequências (Vantagens e Desvantagens)**

**Vantagens:**

-   Permite a criação de objetos complexos de maneira organizada.
-   Código mais legível e fácil de manter.
-   Evita a necessidade de múltiplos construtores sobrecarregados.

**Desvantagens:**

-   Introduz complexidade adicional no código.
-   Pode ser excessivo para objetos simples.
