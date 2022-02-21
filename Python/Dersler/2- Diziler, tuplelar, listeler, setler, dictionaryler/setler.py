"""
SETLER
"""
"""
# listelere benzer.
# elemanları indexsiz ve sırasız.
# burada daelemanlar değişmiyor
# tüm değerler eşsiz unique olmalı.
# performanslı data sağlar.

"""
"""
Tanımlama Şekli

set={}  # boş set
 
set1={1,2,3} # içerisinde integerlar olan set

set2={1,2,4,"ali",(2,3,4),(3,)} #karışık set 
# Setlerin içine liste tanımlanmıyor.

set3= set("ali","emre","ayşe")
"""
mySet={"ali","veli","hakan"}
#print(mySet)

for isim in mySet:
    print(isim)

if "ali" in mySet:
    print("listede var.")

"""
# Listelerdeki elemanlar değiştirilemez.
"""

ex={"a","b","c","d"}
"""
Listeye eleman ekleme

"""
ex.add("e")
print(ex)

"""
tek bir satırda birden çok eleman ekleme
"""
ex.update(["f,","g","h","i"]) #update fonksiyonu varolan bir elemanı update etmiyr seti kmple udate ediyor. 
print(ex)

# Setleride diğer fonksiyonları da kullanabiliyoruz
print(len(ex))

"""
Eleman silme
"""
ex1={1,2,3,4,5,6,7}

ex1.remove(6)
print(ex1)

ex1.discard(6) #discard fonksiyonu hata verdirtmiyor

"""
Seti temizlemek
"""
a={1,2,3,4,5,6,7,8}
print(len(a))
a.clear()
print(len(a))