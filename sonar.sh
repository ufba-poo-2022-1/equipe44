cd Sumula
ant
sonar-scanner \
  -Dsonar.organization=ufba-poo-2022-1 \
  -Dsonar.projectKey=ufba-poo-2022-1_equipe44 \
  -Dsonar.sources=. \
  -Dsonar.host.url=https://sonarcloud.io \
	-Dsonar.java.binaries=bin
