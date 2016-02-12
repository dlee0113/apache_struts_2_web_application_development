require 'rest_client'
require 'rexml/document'

begin
    url = "http://localhost:8080/recipe"
    r = RestClient::Resource.new(url)
    doc = REXML::Document.new(r.send("get"))

    recipes = []
    doc.elements.each("list/com.packt.s2wad.ch13.models.Recipe") do |el|
        recipes << [el.elements['id'].text.to_i,
                    el.elements['name'].text]
    end

    recipes.sort! {| a,b | a[0] <=> b[0] }

    recipes.each do |r|
        puts "ID #{r[0]}: #{r[1]}"
    end
rescue RestClient::Exception => e
    puts e.response.body if e.respond_to? :response
    raise
end
