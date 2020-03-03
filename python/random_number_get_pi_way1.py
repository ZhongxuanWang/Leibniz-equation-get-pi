import random
import math

# The bigger this number is, the more accurate result would be produced.
num_of_cal = 1000000

area_of_circle = 0
area_of_square = 0

def calc(num):
    global area_of_circle, area_of_square
    for n in range(num):
        if math.sqrt(random.random()**2+random.random()**2) <= 1:
            area_of_circle += 1
        area_of_square += 1
    print(area_of_circle/area_of_square*4)

if __name__ == "__main__":
    calc(num_of_cal)
