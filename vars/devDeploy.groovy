def call(def hosturl,def user, def dest){

	sh "ssh ${user}@${hosturl}"
	sh "cd ${dest}"
	sh "lsof -ti tcp:8080 | xargs kill"
	sh "java -jar *.jar"
	sh "exit" 

}