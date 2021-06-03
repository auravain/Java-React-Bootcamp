let sayi1 = 10;
sayi1 = 'İlknur Sucaklı';
let student = { id: 1, name: 'İlknur' };
//console.log(student);

function save(puan = 10, ogrenci) {
	console.log(ogrenci.name + ': ' + puan);
}
//save(undefined, student);

let students = ['İlknur Sucaklı', 'Birisi birisi', 'Öbürü öbürü', 'Öteki öteki'];

//console.log(students);

let students2 = [student, { id: 2, name: 'Birisi' }, 'İstanbul', { city: 'İzmir' }];
//console.log(students2);

//*rest
//*params--> C#'daki karşılığı
//*varArgs--> Java'daki karşılığı
let showProducts = function (id, ...products) {
	console.log(id);
	console.log(products);
};

//console.log(typeof showProducts);
//showProducts(10, 'Elma', 'Armut', 'Karpuz');

//*spread
let points = [1, 2, 3, 4, 50, 4, 60, 14];
console.log(...points);
console.log(Math.max(...points));
console.log('ABC', 'D', ...'EFG', 'H');

//*Destructuring: Elimizdeki değerleri, değişkenlere atama yöntemi.
let populations = [10000, 20000, 30000, [40000, 10000]];
let [small, medium, high, [veryHigh, maximum]] = populations;
console.log(small);
console.log(medium);
console.log(high);
console.log(veryHigh);
console.log(maximum);

function someFunction([small1], number) {
	console.log(small1);
}

someFunction(populations);

let category = { id: 1, name: 'İçecek' };
console.log(category.id);
console.log(category['name']);

let { id, name } = category;
console.log(id);
console.log(name);
