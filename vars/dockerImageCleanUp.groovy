sh """
docker rmi ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest
"""