#!/bin/bash -x

flips = 1
heads = 0
tails= 0

while []





while flips <= 11
    coin = $(( RANDOM:0:1 ))
    flips +=1
    if coin == 1:
        print("Heads")
        heads += 1
    elif coin == 2:
        print("tails")
        tails += 1

print("You got " + str(heads) +  " heads and " + str(tails) + " tails!")
raw_input("Exit")
