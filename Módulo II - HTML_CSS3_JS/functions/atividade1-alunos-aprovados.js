let students = [
    {
        name: 'Jõao',
        note: 7,
        class: '1a'
    },
    {
        name: 'Sophia',
        note: 6,
        class: '1b'
    },
    {
        name: 'Greg',
        note: 4,
        class: '1f'
    },
    {
        name: 'Martha',
        note: 2,
        class: '1c'
    }

]

function studentsInSchool(array, schoolAverage){
    let approvedStudents = [];
    
    for (let i = 0; i < array.length; i++) {
        const {note, name} = array[i] // object destructring
        if(note >= schoolAverage){
            approvedStudents.push(name)
        }
    }
    return approvedStudents;
}

let average = 6
console.log(studentsInSchool(students, average))