"""LISTELER"""

"""
Boş Liste 

list=[]
"""
"""
İntiger listesi

list2=[1,2,4,5]
"""
"""
Karışık liste
list3=[1,2,"hello",2.4,7]
"""

isim_list=["ali","veli","ayşe"]

print(isim_list[0]) # listenin s0.indexi yazdır.

isim_list[0]="kerem" # listenin 0. indexini bu şekilde değiştirebiliriz.

isim_list.append("ahmet") #append fonksiyonu ile listeye yeni eleman ekledik.
print(isim_list)

isim_list.remove("veli") #remove fonksiyonuyla listeden bir eleman sildik
print(isim_list)

"""
List Constructor
"""
Sehirler=["Ankara","Istanbul"]
print(Sehirler)


"""
LISTE FONKSIYONLARI
"""

#print(Sehirler.clear()) # clear fonksiyonunu listeyi temizler
print(Sehirler)

print("Ankara sayısı: " + str(Sehirler.count("Ankara"))) # listedeki hernahgi bir değerden kaç tane olduğunu count fonksiyonuyla saydırırız

print("Ankara indexi: " + str(Sehirler.index("Ankara"))) # listedeki herhangi bir değerin kaçıncı indexte olduğunu index fonkisyonyla buluruz.
# index fonksiyonu bir değerbulduktan sonra kendini sonlandırır. Eğer listede birden fazla ayı değer varsa sadece ilk bulduğu değerin indexini yazdırıyor.

#Sehirler.pop(1) #pop fonksiyonu indexe göre silme işlemini ereçklerştirir.

Sehirler.insert(1, "Konya") #insert fonksiyonu belirlediğimiz indexe verdiğimiz değeri ekler ve o indexteki değeri de bir sonraki indexe yazar.
print(Sehirler)

Sehirler.reverse() #reverse fonksiyonu listeyi tersten yazdırır. 
print(Sehirler)


"""
*** referans tip ***
"""
aa=["Ankara", "Istanbul","Konya"]

bb=aa

#bb[0]="Izmir"
print(aa)
print(bb)

"""
Bir referans değişkeni bir başka değere atamak onu kopyalamaz.
Burada aa listesi bir referans tiptir. aa listesinin bellekteki yeri ve bb listesinin bellekteki yeri aynıdır.
"""

cc=aa.copy() # copy fonksiyonu lisyeyi başka bir değişkene kopyalar.
cc[0]="Izmir"
print(cc)
print(aa)

aa.extend(cc) # extend fonksiyonu iki farklı listeyi birleştirir.
print(aa) 

aa.sort() # listeyi alfabetik olarak listeler.
print(aa)

