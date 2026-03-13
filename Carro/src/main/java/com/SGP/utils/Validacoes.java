package com.SGP.utils;

/**
 * Classe utilitária para validação de dados de entrada.
 * Contém métodos estáticos para validar marca, ano e modelo,
 * além de retornar mensagens de erro apropriadas.
 * 
 * Esta classe não pode ser instanciada (padrão Utility Class).
 */
public class Validacoes {

    /**
     * Construtor privado para impedir a criação de instâncias.
     * Segue o padrão de classe utilitária (Utility Class Pattern).
     */
    private Validacoes() {
        // Construtor privado para evitar instância
    }

    /**
     * Verifica se o marca informado é válido.
     * Um marca válido não pode ser nulo, vazio ou conter números.
     * 
     * @param marca O marca a ser validado
     * @return true se o marca for válido, false caso contrário
     */
    public static boolean marcaValido(String marca) {
        // Retorna false se o marca for nulo, vazio ou contiver dígitos
        return !(marca == null || marca.trim().isEmpty() || marca.matches(".*\\d+.*"));
    }

    /**
     * Retorna uma mensagem de erro caso o marca seja inválido.
     * 
     * @param marca O marca a ser verificado
     * @return Mensagem de erro descritiva ou string vazia se válido
     */
    public static String mensagemErromarca(String marca) {
        // Verifica se o marca é nulo ou vazio
        if (marca == null || marca.trim().isEmpty()) {
            return "Erro: O marca não pode estar vazio!";
        // Verifica se o marca contém números usando regex
        } else if (marca.matches(".*\\d+.*")) {
            return "Erro: O marca não pode conter números!";
        }
        // Retorna string vazia se o marca for válido
        return "";
    }

    /**
     * Verifica se a ano informada é válida.
     * A ano deve estar entre 0 e 150 anos.
     * 
     * @param ano A ano a ser validada
     * @return true se a ano estiver no intervalo válido, false caso contrário
     */

    public static boolean anoValida(int ano) {
        // ano válida: de 1970 pro além (inclusive)
        return ano >= 1970;
    }

    /**
     * Retorna uma mensagem de erro caso o ano seja inválido.
     * 
     * @param ano o ano a ser verificado
     * @return Mensagem de erro descritiva ou string vazia se válida
     */
    public static String mensagemErroano(int ano) {
        // Verifica se o ano é negativa
        if (ano < 1970) {
            return "Erro: O ano não pode ser negativo!";
        // Verifica se a ano excede o limite máximo
        } 

        else{}
        // Retorna string vazia se a ano for válida
        return "";
    }

    /**
 * Verifica se o modelo do carro é válido.
 * O modelo pode ter letras e números (ex: BMW M2).
 *
 * @param modelo Modelo do carro
 * @return true se o modelo for válido
 */
public static boolean modeloValido(String modelo) {
    return modelo != null && modelo.trim().length() >= 1 && modelo.length() <= 30; //verificando se o modelo do carro é válido
}

/**
 * Retorna mensagem de erro caso o modelo seja inválido.
 *
 * @param modelo Modelo do carro
 * @return mensagem de erro ou string vazia
 */
public static String mensagemErroModelo(String modelo) {

    if (modelo == null || modelo.trim().isEmpty()) {
        return "Erro: modelo não pode estar vazio!";
    }

    if (modelo.length() < 2) {
        return "Erro: modelo muito curto!";
    }

    if (modelo.length() > 30) {
        return "Erro: modelo muito longo!";
    }

    return "";
}
}