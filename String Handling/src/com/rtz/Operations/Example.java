package com.rtz.Operations;

class Example{
	int x;

	public Example(int x) {
		this.x = x;
	}
	
	@Override
	public int hashCode() {
		return x;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Example) {
			Example e=(Example)obj;
			return (this.x==e.x);
		}
		return false;
	}
	
}