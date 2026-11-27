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
├── .idea/                          # configurações do IntelliJ IDEA
├── .vscode/                        # configurações do VS Code
├── src/
│   ├── atividade/                  # exercícios práticos
│   ├── datas/                      # trabalhando com datas e horas
│   ├── enumeracoes/                # enums
│   ├── funcoes/                    # métodos / funções
│   ├── fundamentos/                # sintaxe, tipos, operadores e controle de fluxo
│   ├── heranca/                    # herança e polimorfismo
│   ├── memoria_arrays_listas/
│   │   ├── vetores/                # arrays unidimensionais
│   │   │   └── exercicios/         # AbaixoDaMedia, Alturas, Aprovados, MaisVelho...
│   │   ├── matrizes/               # arrays multidimensionais
│   │   ├── listas/                 # List, ArrayList e coleções
│   │   ├── foreachs/               # laço for-each
│   │   ├── boxing_unboxing/        # classes wrapper e boxing/unboxing
│   │   └── pensionato/             # projeto prático (Pensionato, Rent)
│   ├── oo/                         # orientação a objetos
│   ├── Main.java
│   └── Teste2.java
├── .gitignore
└── primeiro_Projeto_*.iml          # arquivo de módulo do IntelliJ
```

---

## ✅ Conteúdo abordado

| Status | Tema | Pasta | O que foi praticado |
|:------:|------|-------|---------------------|
| ✅ | Fundamentos | `fundamentos` | Variáveis, tipos primitivos, operadores, `if/else`, `switch`, laços |
| ✅ | Funções | `funcoes` | Métodos, parâmetros, retorno, sobrecarga |
| ✅ | Vetores | `memoria_arrays_listas/vetores` | Arrays unidimensionais e exercícios (soma, média, maior valor, filtros) |
| ✅ | Matrizes | `memoria_arrays_listas/matrizes` | Arrays multidimensionais |
| ✅ | For-each | `memoria_arrays_listas/foreachs` | Percorrer arrays e coleções |
| ✅ | Listas | `memoria_arrays_listas/listas` | `List`, `ArrayList` |
| ✅ | Wrappers | `memoria_arrays_listas/boxing_unboxing` | Boxing, unboxing e classes wrapper |
| ✅ | Projeto Pensionato | `memoria_arrays_listas/pensionato` | Aplicação prática com vetores e objetos |
| ✅ | Datas | `datas` | Manipulação de datas e horas |
| ✅ | Enumerações | `enumeracoes` | `enum` |
| ✅ | Orientação a Objetos | `oo` | Classes, objetos, atributos, métodos, construtores, encapsulamento |
| ✅ | Herança | `heranca` | `extends`, `super`, polimorfismo |
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

# 2. Compilar tudo (Linux/macOS/Git Bash)
javac -d out $(find src -name "*.java")

# 3. Executar uma classe pelo nome completo do pacote
java -cp out Main
java -cp out memoria_arrays_listas.vetores.exercicios.Alturas
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