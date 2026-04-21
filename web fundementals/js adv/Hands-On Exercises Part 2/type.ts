interface student{
    name: string;
    percentage: number;
}
function printProgress (student:student){
    console.log(student.name+'has completed' + student.percentage + '%of the bootcamp.');
}
const student1 = {name:'Alice',percentage:80};
printProgress(student1);
printProgress({name:'Bob' , percentage: 0});