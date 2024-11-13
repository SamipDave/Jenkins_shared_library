def call(String aws_account_id, String region, String ecr_repoName) {

    sh """
    
    docker build -t ${ecr_repoName} .
    docker tag ${ecr_reponame}:latest${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}


    """
    }
