def call(def hosturl,def user, def dest){

//	sh "ssh ${user}@${hosturl}"
	sh " ssh -tt ubuntu@52.10.25.211 fuser -k 8080/tcp "
    sh " ssh -tt ubuntu@52.10.25.211 java -jar *.jar "

}