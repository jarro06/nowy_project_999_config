 
listView('nowy_project_999 Jobs') {
    description('nowy_project_999 Jobs')
    jobs {
        regex('nowy_project_999_.+')
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
