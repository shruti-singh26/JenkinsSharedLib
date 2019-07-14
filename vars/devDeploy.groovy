def call (def host, def dest){
	sh "ssh host"
	sh "cd dest"
	sh "lsof -ti tcp:8080 | xargs kill"
	sh "java -jar *.jar"
	sh "exit"

}