from time import time
import math


def calculate_pi(time_allowed):
    time_start = time()
    counter = 1
    total_sum = 0
    while time_start + time_allowed > time():
        total_sum += 1 / counter ** 2
        counter += 1
    return math.sqrt(total_sum * 6)


if __name__ == '__main__':
    print(calculate_pi(5))
