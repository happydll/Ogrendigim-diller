"""
TUPLE
"""

# dizilere benzer
# tek farkı dizlerde elemanlar değiştirilebilirken tuplelarda değiştirilemezler
# performanslı bir veri sağlar

"""
Tanımlama

tuple=() #boş tuple

tuple=(1,2,3,4) #tuple having intigrier

tuple=("ali",1,2,4) #mixed tuple

tuple=("ali",1,2 [1,3,5],3) #nested tuple
"""

tupleList=(2,3,4,"ali",(7,6,5),[0,1,2]) 
list=[2,3,4,"ali",(7,6,5),(9,45)]
#tuple ın içinde iste listenin içinde tuple tanımlanabilir.

print(type(tupleList))
print(type(list))

print(tupleList)
print(list)
print("\n")
print("tuplelist eleman sayısı: "+ str(len(tupleList)))
print("List elaman sayısı: " + str(len(list)))

print("\n")
"""
list[0]=9
print(list) #listelerin elemanları değiştirilebilir.

tupleList[0]=9
print(tupleList) #tuplellar değiştirilemez sadece readony.
"""

print(tupleList[-2]) #listelerdeki elamanlar soldan sıfır değerini alarak indexlenir ama biz index çağırırken "-" kullanırsak sağdan sayarak bize değeri getirir.

print(list[-2])

"""
*** trick ***
"""

tupleDeger=("ali")
print(type(tupleDeger)) 
"""
içerisinde string olan tek elemanllı bir tuple tanımladık 
ama typeını yazdırıdımızda python veri tipini tuple olarak değil de 
string olarak verdi.
"""
tupleDeger2=("ali",)
print(type(tupleDeger2))
"""
burada python ın bu veri tipinin tuple olarak görebilmesi için
giriğimiz tek değerden sonra bir "," eklemeliyiz.
"""
