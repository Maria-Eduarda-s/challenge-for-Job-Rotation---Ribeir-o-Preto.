/*
 * 4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. 
 * O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a 
 * uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?

IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.

resolução:

o espaço inicial do carro é 0.
o espaço inicial do caminhão é 100km.
a velocidade do carro 110km.
a velocidade do caminhão 80km.

-no ponto de encontro os veículos tem espaços iguais
carro = caminhão (50km = 50km)

-tempo que cada veículo leva para chegar ao local de encontro
tempo = distância/velocidade
carro: 50km, 110km/h
 50/110 = 0,45h | conversão para minutos:  0,45.60 = 27 minutos
caminhão: 50km, 80km/h
 50/80 = 0,625h | conversão para minutos: 0,625.60 = 37,5 + 5.2(pedagio) = 47,5 minutos (47,5/60=0,791h)
 
 -distância percorrida pelos veículos
 distância = velocidade x tempo
 carro: 110km, 0,45h
 110.0,45 = 49,5km
 caminhão: 80km, 0,625h
 80.0,791 = 63km

 -valores finais: 
 carro- tempo: 27 minutos | distância: 49,5km
 caminhão- tempo: 47,5 minutos | distância: 63km
 com isso podemos concluir que o veículo mais próximo de Ribeirão Preto é o caminhão, pois
 ele está indo à Ribeirão Preto, o que significa que falta apenas 37km(100km - 63km = 37km) para chegar até o local, enquanto
 o carro já se afastou 49,5km(pois ele está indo em direção à França).
 */



package cod;

public class ex04 {
	
	public static void main(String[]args) {
		
	}

}
