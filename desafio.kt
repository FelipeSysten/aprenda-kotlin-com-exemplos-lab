// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String) {
    // Você pode adicionar mais atributos aqui, como email, idade, etc.
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60) {
    // Se desejar, pode adicionar mais informações, como descrição, autor, etc.
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    // Método para listar os inscritos
    fun listarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println(it.nome) }
    }
}

fun main() {
    // Criação de alguns objetos para simular cenários de teste
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 90)

    val formacao = Formacao("Programação Kotlin", listOf(conteudo1, conteudo2))

    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    // Matricula os usuários na formação
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Lista os inscritos
    formacao.listarInscritos()
}