sayı=11111 #intiger
değer="11111" #string
sayı1=10.0 #float

a=(float(değer) +1)

print(a)
print(type(sayı1)) #veri tipini söyleyen kod

#String

mesaj="Nabüün lan gevşek."

"""
String fonksiyonlari
"""

"""
print(mesaj[2:5])

yenimesaj=mesaj[10:14]

print(yenimesaj)

a=len(mesaj)
print(a)
"""

#print(len(mesaj))

mesaj2=mesaj[len(mesaj)-5:len(mesaj)]
print(mesaj2)

#Lover-Upper
mesaj="Nabüün lan gevşek."

print(mesaj.upper())
print(mesaj.lower())

#Replace
mesaj="Nabüün lan gevşek."

#print(mesaj.replace("ü","u"))
mesaj=mesaj.replace("ü","u")
print(mesaj)

#Split-Strip

#split
ben="Yasin İnan 21 Ankara"

print(ben.split())

#strip
a="kanal istanbull".strip("k")
print(a)

"""
input
"""

ad=input("Adınız ?\n")

sayı=input("sayı giriniz:\n ")