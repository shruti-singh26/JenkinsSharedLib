def call(def hosturl, def dest){
	sh "ssh ${hosturl}"
	sh "cd ${dest}"
	sh "lsof -ti tcp:8080 | xargs kill"
	sh "java -jar *.jar"
	sh "exit"

}