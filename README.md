FizzBuzz
========
FizzBuzz is a classic coding problem given during interviews. While it's fairly trivial, many engineers have issues with this simple question. Here are my solutions in various languages. Use them to learn from, critique, or if you want, evalaute my coding skills. Feel free to use them & learn from them, but please don't re-use them verbatim for professional purposes (come up with your own solution). As a result, I've set these as BSD-clause 2 license.

ruby
----

My approach here was to make a flexible "FizzBuzz" class that can use generic rules. I wanted to avoid the class if/then/else code chain, and show how the dynamic nature of ruby can lead to some very readable & flexible code.

C
---

My approach here was to use again to use functions for fizz & buzz (for extensibility). One of the common dynamic programming approaches in C is to use a dispatch table of function pointers. I also wanted to show here how C can be a very functional language. The only downside for this solution is having to pass in char buffers. This avoids memory leaks and is very efficient, but ends up meaning that parameters end up being use for return values (really not a fan of this).

javascript
----------

My approach here for the fizz/buzz functions was to throw them in an array an use the map function to call each. The end result is very function and pretty flexible. This shows of how nice & clean javascript's function pointers are to work with. I like that javascript is a function language hiding in AGOL's clothing.

TODO
----

Other languages? Not sure which ones to do next.

