def call (def source, def dest, def IP,def user){
	sh " scp ${source} ${user}@${IP}:${dest}"

}