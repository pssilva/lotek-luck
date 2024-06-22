#!/bin/bash
########################################
#
# Filename: vars_templates.sh
#
# Variaveis usadas como templates e retuilização!
# para o projeto: {{NAME_PROJECT}}
#
########################################

#!/bin/bash
########################################
#
# Filename: vars_templates.sh
#
# Variaveis usadas como templates e retuilização!
# para o projeto: {{NAME_PROJECT}}
#
########################################

export MAVEN_SUREIFRE_PLUGIN=$(cat <<EOF
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>\$\{surefire-plugin-version\}</version>
        <configuration>
            <skipTests>true</skipTests>
        </configuration>
    </plugin>
EOF
);

SPRINGBOOT_MAVEN_PLUGIN=$(cat <<EOF

EOF
);

########################################
