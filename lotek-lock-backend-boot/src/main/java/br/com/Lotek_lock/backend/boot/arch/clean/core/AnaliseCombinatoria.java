package br.com.Lotek_lock.backend.boot.arch.clean.core;

import java.math.BigInteger;
import java.util.Objects;

public final class AnaliseCombinatoria {

    public static Integer QUANTIDADE_TOTAL_ELEMENTOS = 60;

    public static Integer TAMANHO_JOGO_ELEMENTOS = 6;

    private AnaliseCombinatoria() {}

    /**
     * @param n inteiro quantidade total de elementos
     * @param k inteiro tamanho de elementos do jogo
     *
     * @return resultado do calculo da analise combinatória
     *
     * @throws ArithmeticException no caso do denomidor se igualar a zero
     * @throws IllegalArgumentException nos casos que o tamanho não atendam os requisitos!
     *
     */
    public static BigInteger c(final Integer n, final Integer k){


        //TODO Validação com trabalho em progresso
        if (Objects.equals(n, 0)
                && Objects.equals(k, 0)) {
            throw new ArithmeticException("Os tamanhos dos elementos não atendem os requisitos!");
        }

        //TODO Validação com trabalho em progresso
        if ( n > QUANTIDADE_TOTAL_ELEMENTOS
                && k > TAMANHO_JOGO_ELEMENTOS ) {
            throw new IllegalArgumentException("Os tamanhos dos elementos não atendem os requisitos!");
        }
        return BigInteger.ZERO;
    }

}
