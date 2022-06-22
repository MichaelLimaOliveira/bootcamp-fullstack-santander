function generateBornDateFromAge(age) {
    return 2016 - age;
   }
    
    
   function generateUserDescription(name, surName, age) {
    const fullName = name + " " + surName;
    const bornDate = generateBornDateFromAge(age);
    
    
    return fullName + " is " + age + " old and was born in " + bornDate;
   }
    
    
  let result = generateUserDescription("Waldemar", "Neto", 26);

  console.log(result)