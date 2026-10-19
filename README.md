# ☕ Curso de Java

Repositório com os exercícios e anotações práticas do meu estudo de **Java**, organizado em pacotes por tema — dos fundamentos da linguagem até orientação a objetos, herança e coleções.

> Material de estudo: *Nelio Alves* e Oracle - Java Documentation.

---

## 📑 Sumário

- [Estrutura do projeto](#-estrutura-do-projeto)
- [Conteúdo abordado](#-conteúdo-abordado)
- [Como executar](#-como-executar)
- [Ferramentas](#-ferramentas)

---

## 📂 Estrutura do projeto

```text
Cursojava/
├── .idea/                  # configurações do IntelliJ IDEA
├── .vscode/                # configurações do VS Code
├── src/
│   ├── atividade/          # exercícios práticos
│   ├── boxesWrapper/       # classes wrapper e boxing/unboxing
│   ├── datas/              # trabalhando com datas e horas
│   ├── enumeracoes/        # enums
│   ├── foreachs/           # laço for-each
│   ├── funcoes/            # métodos / funções
│   ├── fundamentos/        # sintaxe, tipos, operadores e controle de fluxo
│   ├── herança/            # herança e polimorfismo
│   ├── listas/             # List, ArrayList e coleções
│   ├── matrizes/           # arrays multidimensionais
│   ├── oo/                 # orientação a objetos
│   ├── vetores/            # arrays unidimensionais
│   ├── Main.java
│   └── Teste2.java
├── .gitignore
└── primeiro_Projeto_*.iml  # arquivo de módulo do IntelliJ
```

---

## ✅ Conteúdo abordado

| Status | Tema | Pasta | O que foi praticado |
|:------:|------|-------|---------------------|
| ✅ | Fundamentos | `fundamentos` | Variáveis, tipos primitivos, operadores, `if/else`, `switch`, laços |
| ✅ | Funções | `funcoes` | Métodos, parâmetros, retorno, sobrecarga |
| ✅ | Vetores | `vetores` | Arrays unidimensionais |
| ✅ | Matrizes | `matrizes` | Arrays multidimensionais |
| ✅ | For-each | `foreachs` | Percorrer arrays e coleções |
| ✅ | Listas | `listas` | `List`, `ArrayList` |
| ✅ | Datas | `datas` | Manipulação de datas e horas |
| ✅ | Enumerações | `enumeracoes` | `enum` |
| ✅ | Wrappers | `boxesWrapper` | Boxing, unboxing e classes wrapper |
| ✅ | Orientação a Objetos | `oo` | Classes, objetos, atributos, métodos, construtores, encapsulamento |
| ✅ | Herança | `herança` | `extends`, `super`, polimorfismo |
| ✅ | Atividades | `atividade` | Exercícios de fixação |

---

## ▶️ Como executar

### Pré-requisitos

- [ ] JDK 17 ou superior instalado (`java -version`)
- [ ] IntelliJ IDEA **ou** VS Code com o *Extension Pack for Java*
- [ ] Git instalado

### Passo a passo

```bash
# 1. Clonar o repositório
git clone https://github.com/zesantos-ctrl/Cursojava.git
cd Cursojava

# 2. Compilar (exemplo com o Main.java)
javac -d out src/Main.java

# 3. Executar
java -cp out Main
```

> 💡 Cada pasta dentro de `src/` pode ser aberta e executada diretamente pela IDE — basta rodar o método `main` da classe desejada.

---

## 🛠️ Ferramentas

| Ferramenta | Uso |
|------------|-----|
| Java (JDK) | Linguagem e compilador |
| IntelliJ IDEA | IDE principal |
| VS Code | Editor alternativo |
| Git / GitHub | Versionamento e publicação dos exercícios |

---


## 👤 Autor

**José** — estudando Java com foco em construir uma base sólida em programação.
