def call(Map stageParams) {
    checkout([
        $class: 'GitScm',
        branches: [[name: stageParams.branch]],
        userRemoteConfigs:[[url:stageParams.url]]
    ])
}