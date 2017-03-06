import csv


sort_list=[]
rows = []
max_sal = 4.500


def create__save_emp():
    avg_salary = 1.200
    max_Employees = 3
    for n in range(0, max_Employees):
        row = {'full_name': input('Enter employee`s name:').strip(),
               'employee_id': input('Enter employee`s id:').strip(),
               'emp_dept': input('Enter employee`s deptartment:').strip(),
               'dept_sal': float(input('Enter dept salary:')),
               'emp_sal': float(input('Enter employee salary:'))}
        rows.append(row)
    print(rows)
    writer_file_name = open('employees.csv', 'w')
    fileWriter=csv.writer(writer_file_name)
    for row in rows:
        fileWriter.writerow([row['full_name'], row['employee_id'],row['emp_dept'], row['dept_sal'], row['emp_sal']])
    for row in rows:
        if float(row['dept_sal'])==max_sal:
            sort_list.append(row['emp_dept'])
    sort_list.sort()
    print('first three depts with max salary for the month are:', sort_list)
    top3=sort_list[:3]
    print('here are the first three depts with max salary',top3)
    for row in rows:
        if row['emp_sal'] in row:
            sort_list.append(row['emp_sal'])
    sort_list.sort()
    top3_emp=sort_list[:2]
    print('first three employees with max_sal', top3_emp)
    for row in rows:
        if float(row['emp_sal']) < avg_salary:
            sort_list.append(row['emp_sal'])
    sort_list.sort()
    print('employees with minimum salary:', sort_list)
    writer_file_name.close()

def avg_sal():
        print('enter number of department employees here:')
        num_emp = int(input())
        emp_sal = []
        for i in range(0, num_emp):
            print('enter your salary here:')
            employee_sal = float(input())
            emp_sal.append(employee_sal)
            avg = sum(emp_sal) / num_emp
        print('your avg salary for the department is', avg)

def del_emp(id_empl):
    create__save_emp()
    for row in rows:
        if row['employee_id']==id_empl:
            rows.remove(row)
            print('employee has been deleted', rows)

def add_employeer():
    row = {'full_name': input('Enter employee`s name:').strip(),
           'employee_id': input('Enter employee`s id:').strip(),
           'emp_dept':input('Enter employee`s deptartment:').strip(),
           'dept_sal':float(input('Enter dept salary:')),
           'emp_sal': float(input('Enter employee salary:'))}
    rows.append(row)
    print('new employee has been added to the list',rows)
    return row

def get_employee(id_empl):
    create__save_emp()
    for row in rows:
        if row['employee_id']==id_empl:
            return row

def search_emp(id_empl, name_empl):
    create__save_emp()
    for row in rows:
         if row['employee_id'] == id_empl:
            print(row)
         if row['full_name']==name_empl:
             print('here`s the employee you`re searching for',row)


if __name__ == '__main__':
    create__save_emp()
    avg_sal()
    add_employeer()
    get_employee('aa')
    search_emp('aa','ben')
    del_emp('ab')

