#!/bin/bash
# Filename: LotekLockScriptsUteis_main.sh

#########################################################
#
# Auth: Paulo Sérgio <pss1suporte@gmail.com>
# Describe: Script Main que reuni as libs do projeto no geral
# version: 1.0
# license: MIT License
#
#########################################################

#########################################################
#
# Describe: Definir as Variaveis de ambiente necessárias para o processamento dos algoritmos
# Referencia: 
#
#########################################################
function LotekLockScriptsUteis.setVenvsForAllAlgorithms(){

	source "${ABS_DIRECTORY}/bin/unset_all_env.sh"
	export PARENT_MODULO="LotekLockScriptsUteis"
  export SCRIPT_PATH="${BASH_SOURCE:-$0}"
	export ABS_SCRIPT_PATH=$(realpath "${SCRIPT_PATH}")
  export ABS_DIRECTORY=$(dirname "${ABS_SCRIPT_PATH}")
	export SCRIPT_PATH="${BASH_SOURCE:-$0}"
	export ENV_WORKS="${ABS_DIRECTORY}/bin/env_works"

  source "${ABS_DIRECTORY}/bin/env_works_tool_generate_LotekLockScriptsUteis.sh"
	source "${ABS_DIRECTORY}/bin/vars_templates.sh"

}
export -f LotekLockScriptsUteis.setVenvsForAllAlgorithms

LotekLockScriptsUteis.setVenvsForAllAlgorithms
#########################################################

#########################################################
#
# Describe: Exemplo de como usar a API
# $1: ?????
# Referencia: 
#
#########################################################
function LotekLockScriptsUteis.usage(){
  cat <<EOF
>>>>> MODELO DE USAGE <<<<<
>>>>> NÃO IMPLEMENTADO <<<<<

usage: ${0##*/} LotekLockScriptsUteis.nomeMetodo [options] [args]
  
  Options:
    -h,--help     Print this help message
    --version     Print version
    -u            Get update
    --no-color    Disable colors

* This option '-u' still not implanted

EOF

}
export -f LotekLockScriptsUteis.usage
if [[ $1 = @(-h|--help) ]];then
  LotekLockScriptsUteis.usage 
  exit 0
fi
#########################################################

#########################################################
#
# Describe:  Estrutura do menu da LotekLockScriptsUteis que sobreescrve
#            o da aplicação geral
# Referencia: 
#
#########################################################
function LotekLockScriptsUteis.menu()
{

  	echo "####################################################"
  	echo "### $NAME_APP :: LotekLockScriptsUteis.menu"
  	echo "####################################################"

	PS3="LotekLockScriptsUteis »»» Selevione uma das opções: "
	select OPCAO in "Voltar" "Criar Projeto" tarefa3 tarefa4 tarefa5 fim; do
	case $OPCAO in
	  "Voltar")
  		    echo "###################################"
          #echo "OPCAO >> $OPCAO"
  				SpringBatch.menu "$ENV_WORKS"
          echo "###################################"
  			;;
		"Criar Projeto")
        echo ""
        echo "###################################"
        echo "Criar Projeto >> $OPCAO"
        echo "###################################"
        echo ""
			;;
		tarefa2)
        echo ""
				echo "###################################"
				echo "tarefa2 >> $OPCAO" 
				echo "###################################"
        echo ""
			;;
		tarefa3)
        echo ""
				echo "###################################"
				echo "tarefa3 >> $OPCAO" 
				echo "###################################"
        echo ""
			;;
		tarefa4)
        echo ""
				echo "###################################"
				echo "tarefa4 >> $OPCAO" 
				echo "###################################"
        echo ""
			;;
		fim)
		    echo "###################################"
        echo " LotekLockScriptsUteis.menu »»» Finalizado!!"
        echo "###################################"
        break;;
		*)
        echo ""
				echo "###################################"
				echo "Opção não encontrada!"
				echo "###################################"
        echo ""
			;;
	esac
	done
	return 0; # Return value
}
export -f LotekLockScriptsUteis.menu
#########################################################

#########################################################
#
# Função Principal: Main do projeto: LotekLockScriptsUteis
# $1: Primeiro parametro da função
# Referencia: @see 
#
#########################################################
function LotekLockScriptsUteis()
{
  export LISTA_MANU
  LISTA_MANU=$(cat <<EOF
##############################################
 # Algoritmo de Trabalho
 #1) Criar a estrutura de pastas!
 #      echo -e "Não implementado
 #2) Instalações necessárias!
 #      echo -e "Não implementado
 #3) Passo 3
 #      echo -e "Não implementado
 #4) Passo 4
 #
 #NOTA: para cada passo criar uma função!
 ###############################################
EOF
  );
  echo -e "${LISTA_MANU}"
	return 0;
}

export -f LotekLockScriptsUteis
#########################################################

