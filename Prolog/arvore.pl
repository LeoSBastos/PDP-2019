%Fatos
gerou(zenaide, anselmo).
gerou(jair, anselmo).
gerou(conceicao, analete).
gerou(antonio, analete).
gerou(anselmo, sabrina).
gerou(anselmo, leonardo).
gerou(analete, leonardo).
gerou(sabrina ,cecilia).

feminino(zenaide).
feminino(analete).
feminino(conceicao).
feminino(sabrina).
feminino(cecilia).
masculino(jair).
masculino(antonio).
masculino(anselmo).
masculino(leonardo).
% Regras
filho(Y,X) :-
    gerou(X,Y).
mae(X,Y) :-
    gerou(X,Y),
    feminino(X).

avos(X,Z) :-
    gerou(X,Y),
    gerou(Y,Z).
