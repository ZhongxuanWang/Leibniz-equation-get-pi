import random
import math

it = 100000000
area = 0

for _ in range(it):
  area += math.sqrt(1 - random.random()**2)
  
 print(area*4/iter)
