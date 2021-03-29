# On assertions

Answer the following questions:

1. The following assertion fails `assertTrue(3 * .4 == 1.2)`. Explain why and describe how this type of check should be done.

  Il faut utiliser plutôt un assertEquals et indiquant un delta de 0.001 ou 0.0001 pour tenir compte du flottant, le assertTrue comme ça est un flaky test, parfois bon, parfois faux

2. What is the difference between `assertEquals` and `assertSame`? Show scenarios where they produce the same result and scenarios where they do not produce the same result.

  AssertEquals vérifie que deux objets sont identiques, assertSame vérifie que deux référence désigne le même objet.
  Si on test un objet avec lui même les deux produirons le même résultat, et si par exemple on crée une vraie copie d'un objet on aura les mêmes attributs mais pas la même adresse

3. In classes we saw that `fail` is useful to mark code that should not be executed because an exception was expected before. Find other uses for `fail`. Explain the use case and add an example.

Dans certain cas on veut tester qu'on exception est bien déclenché, pour s'en assurer on peut placer un assertFail() juste après, si celle-ci s'active c'est que l'exception n'a pas eu lieu

4. In JUnit 4, an exception was expected using the `@Test` annotation, while in JUnit 5 there is a special assertion method `assertThrows`. In your opinion, what are the advantages of this new way of checking expected exceptions?

 Il y a davantage de clarté en Junit5 puisque 'assertThrows' indique clairement ce qui est attendu comme comportement, là où @Test n'évoque rien
