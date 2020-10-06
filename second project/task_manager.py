with open("tasks.txt","r") as f:
    username = "admin" #inputs user and password
    password = "adm1n" 
    theirUsername = input("What is your username?\n") 
    theirPassword = input("What is your password?\n") 
    while theirUsername != username or theirPassword != password:#will repeatedly ask for correct username and pasword until given
        print("incorrect") 
        theirUsername = input("What is your username?\n") 
        theirPassword = input("What is your password?\n") 
    print("correct")
    f.close()
    ch = input("please select the following options: \nr-register user\na-add task\nva-view all task\nvm- view my tasks\ne-exit\n")
    if ch == "r":
        username1 = input("input new username")
        password1 = input("input new password")#replaces the previous username and password
        username = username1
        password = password1
        print("you have registered a new user")
    elif ch == "a" : #adds tasks to the tasks.txt
        task_add = open("tasks.txt", "w")
        task = input("input new task\n")
    elif ch == "va":#opens and reads the tasks.txt
        with open("tasks.txt", "r") as g:
            print(f.read)
    elif ch == "vm":# reads seperate taks
        print(f.read)
    elif ch == "e":#exits program
        exit()
f.close()