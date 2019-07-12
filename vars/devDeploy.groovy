def call (def source, def dest, def devid){
	withCredentials([string(credentialsId:'devid', variable: 'host')]) {
	sh "scp ${source} ${host}:${dest}"
	}

}