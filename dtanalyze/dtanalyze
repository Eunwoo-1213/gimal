#산점도 함수
import matplotlib.pyplot as plt
import random


data_x = []
data_1 = []
data_s = []


# data_x, data_1, data_s 의 값을 랜덤하게 100개를 생성해 주세요
for i in range(100):
    data_x.append(random.randint(1,100))
    data_1.append(random.randint(1,100))
    data_s.append(random.randint(100,1000))

data_color = range(len(data_x))
plt.scatter(data_x, data_1, s = data_s, c = data_color, cmap='jet', alpha= 0.7) # cmap 컬러바에 사용될 색상 종류(jet는 무지개 색과 비슷) alpha(불투명도)
plt.colorbar()

plt.show()
