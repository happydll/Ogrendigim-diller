sayi1=int(input("Sayı1'i giriniz.\n"))
sayi2=int(input("Sayı2'yi giriniz.\n"))
sayi3=int(input("Sayı3'ü giriniz.\n"))

if sayi1 > sayi2 and sayi1 > sayi3:
  print("En büyük sayı sayı 1 dir")
  if sayi2>sayi3:
    print("En küçük sayı sayı 3 tür")
  else:
    print("En küçük sayı sayı 2 dir")
    
elif sayi2 > sayi3:
  print("En Büyük sayı sayı 2 dir")
  if sayi1>sayi3:
    print("En küçük sayı sayı 3 tür")
  else:
    print("En küçük sayı sayı 1 dir")

else:
  print("En büyük sayı sayı 3 tür")
  if sayi2 > sayi1:
    print("En küçük sayı sayı 1 dir")
  else:
    print("En küçük sayı sayı 2 dir")