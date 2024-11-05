def call(String project, String ImageTag, String hubUser){
    sh """
    docker image build -t ${hubUser}/${project}:${ImageTag} .
    """
}
