print("investment - to calculate the amount of interest you will earn on interest")
print("bond - to calculate the amount you will have to pay on a home loan")
ch = input("Choose either 'investment' or 'bond' from the menu below to proceed ")

total_interst = 0
if ch == "investment":
    Money = float(input(" input money that you are depositing "))
    percentage = float(input(" input percentage for deposit "))
    years = int(input(" input amount of years you are depositing for "))
    ch2 = input(" would you like 'simple' or 'compound' interest ")
    if ch2 == "simple":
       total_interst = Money*(1 + (percentage/100) * years)
    elif ch2 == "compound":
        total_interst = Money*(1 + percentage/100)** years       
elif ch == "bond":
    Money = float(input(" input present value of the house "))
    percentage = float(input(" input interest rate "))
    print(percentage/12)
    month = float(input(" input amount months you plan to pay back "))
    total_interst = (percentage* Money)/(1-(1+percentage)*(-month))
else:
    print("you have typed in the wrong choices")

    
print(" your interest comes to ")
print(total_interst)
