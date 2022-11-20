def run():
    # for contador in range(1000):
    #     if contador % 2 != 0:
    #         continue
    #     print(contador)
    
    # for i in range(10000):
    #     if i == 5678:
    #         break
    #     print(i)

    contador = 0
    while True:
        contador += 1
        if contador == 665:
            break
        elif contador % 3 != 0:
            continue
        print(contador)


if __name__ == '__main__':
    run()