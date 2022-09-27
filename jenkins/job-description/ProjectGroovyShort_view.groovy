 
listView('ProjectGroovyShort Jobs') {
    description('ProjectGroovyShort Jobs')
    jobs {
        regex('ProjectGroovyShort_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
