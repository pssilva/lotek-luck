#!/bin/bash
# ==============================================================
# Filename: LotekLockScriptsUteis_menu_test.sh

# Auth: Paulo Sérgio da Silva <pss1suporte@gmail.com>
# Describe: Script para testa a função AnalistaSistemaRotinas.menu
# version: 1.0
# license: MIT License
#
# ==============================================================

# ==============================================================
# Variaveis de trabalho
# ==============================================================
export NAME_PROJECT="AnalistaSistemaRotinas"
export ARTIFACT_ID="{{ARTIFACT_ID}}"
export PARENT_MODULO="AnalistaSistemaRotinas"
export NOME_MODULO="{{NOME_MODULO}}"
export ROOT_PATH_SCRIPT="automation"

export CORE_PATH="${HOME}/projetos/scripts-shell-uteis/src/main/core"
source "${CORE_PATH}/bin/env_works/env_works_tool_generate_core.sh"

export PATH_SCRITP="${AUTOMATION_PATH}/${PARENT_MODULO}/${NOME_MODULO}"
export SCRIPT_TOOL="${PATH_SCRITP}/${NOME_MODULO}_main.sh"
# ==============================================================

cd "$PATH_SCRITP"

source "$SCRIPT_TOOL"

########################################
#
# Se necessário importar aqui:
#. env_works_general_menu.sh
#
# veja o arquivo modelo em:
#   -> ${CORE_TEMPLATE_PATH}/env_works/env_works_general_MODELO.sh
########################################

########################################
#
# Se necessário importar aqui:
#. env_works_audit_menu.sh
#
# veja o arquivo modelo em:
#   -> ${CORE_TEMPLATE_PATH}/env_works/env_works_audit_modelo.sh
########################################

########################################
#
# Se necessário importar aqui:
#. env_works_maven_menu.sh
#
# veja o arquivo modelo em:
#   -> ${CORE_TEMPLATE_PATH}/env_works/env_works_maven_MODELO.sh
########################################

########################################
#
# Se necessário importar aqui:
#. env_works_README_menu.sh
#
# veja o arquivo modelo em:
#   -> ${CORE_TEMPLATE_PATH}/env_works/env_works_README_MODELO.sh
########################################

########################################
#
# Se necessário importar aqui:
#. env_works_README_menu.sh
#
# veja o arquivo modelo em:
#   -> ${CORE_TEMPLATE_PATH}/env_works/env_works_README_MODELO.sh
########################################

########################################
#
# Se necessário importar aqui:
#. env_works_tool_generate_menu.sh
#
# veja o arquivo modelo em:
#   -> ${CORE_TEMPLATE_PATH}/env_works/env_works_tool_generate_MODELO.sh
########################################

########################################
#
# Variaveis de entrada especificas para o processamento do
# algoritmo: menu
#
########################################

AnalistaSistemaRotinas.menu
#AnalistaSistemaRotinas.menu "$PATH_WORK" "$GROUP_ID" "$ARTIFACT_ID"

echo -e "\n\n\n"
echo -e "################################"
echo -e "# Para testa o código gerado use os comandos: "
echo -e " cd \${ARTIFACT_ID_PATH}"
echo -e " rm -Rf \${ARTIFACT_ID_PATH}"
echo -e " echo \${ARTIFACT_ID_PATH}"
pwd
echo -e "################################"
echo -e "\n\n\n"

#cd "$HOME"

########################################################
# 
# Para executra use os seguintes comandos:
#  
# NOTA: PATH_SRC_TEST pode ser 
#           [src/test/core/src/main/core] 
#           ou 
#           [src/test/automation/src/main/automation]
#
# sudo chmod +x ${HOME}/projetos/scripts-shell-uteis//home/pssilva/projetos/scripts-shell-uteis/src/main/automation/AnalistaSistemaRotinas/LotekLockScriptsUteis_menu_test.sh
# source ${HOME}/projetos/scripts-shell-uteis//home/pssilva/projetos/scripts-shell-uteis/src/main/automation/AnalistaSistemaRotinas/LotekLockScriptsUteis_menu_test.sh
#
########################################################
