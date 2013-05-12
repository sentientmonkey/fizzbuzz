#!/usr/bin/env ruby -w

class Bazinator
  attr_accessor :range

  def initialize(range)
    @range = range
  end

  def rules
    @@rules
  end

  def default_rule
    @@default_rule
  end

  def self.default_rule(rule)
    @@default_rule = rule
  end

  def self.rule(rule)
    @@rules ||= []
    @@rules << rule
  end

  def rules
    @@rules
  end

  def run_rules(i)
    results = rules.map{|rule| rule.call(i) }
    results.delete_if(&:nil?)
    results << default_rule.call(i) if results.empty?
    results
  end

  def each(&block)
    range.each do |i|
      yield run_rules(i).join('')
    end
  end

  def print
    each do |item|
      puts item
    end
  end
end

class FizzBuzz < Bazinator
  default_rule ->(i){ i }
  rule ->(i){"Fizz" if i % 3 == 0 }
  rule ->(i){"Buzz" if i % 5 == 0 }
end

fb = FizzBuzz.new(1..100)
fb.print
