package com.example.myfirstapp

fun main() {

    var t:ToDo = ToDo()
    var m:Task =Task(1,"clean","clean the bathroom")
    var k:Task =Task(2,"clean","clean the bathroom", true )
    var l:Task =Task(3,"clean","clean the bathroom", true)

    t.Add_Task(m)
    t.Add_Task(k)
    t.Add_Task(l)
    println("======Show All After Add======")
    t.Show_All()
    t.Change_Task(m)
    println("======Print Id 1 After Change======")
    t.Print_Task(1)
    println("======Show All After Change======")
    t.Show_All()
    t.Remove_Task(1)
    println("======Show All After Remove======")
    t.Show_All()
}

// Data Class Task
data class Task(val id:Int, val name:String, val note:String, var isCompleted:Boolean= false)

// Data Class ToDo
class ToDo(){
    private var tasks = arrayListOf<Task>()

    // Method Show_All that prints all the tasks present in array tasks
    fun Show_All(){
        if (tasks.size == 0){
            println("no tasks found")
            return
        }
        for (i in tasks){
            println(i)
        }
    }

    // Method Print_Task that prints a specific task given the Id
    fun Print_Task(id: Int){
        var task: Task
        for (t in tasks){
            if (id == t.id){
                println(t)
                return
            }
        }
        println("Task with id $id not found")
    }

    // Method Add_Task adds a task to the array tasks given a Task object
    fun Add_Task(task: Task){
        tasks.add(task)
    }

    // Method Remove_Task removes a task from array tasks given an id
    fun Remove_Task(id: Int){
        for (t in tasks){
            if (t.id == id){
                tasks.remove(t)
                break
            }
        }
    }

    // Method Change_Task changes iscompleted status in a task given a task object
    fun Change_Task(task: Task){
         task.isCompleted= !task.isCompleted
        println(task.isCompleted)
    }
}