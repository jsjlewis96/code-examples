package com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes;

/**
 * Rectangle shape class.
 * 
 * @author jsjlewis96
 */
public class Rectangle implements Shape
{

	@Override
	public final void draw()
	{
		System.out.println("Inside Rectangle::draw() method.");
	}

}
