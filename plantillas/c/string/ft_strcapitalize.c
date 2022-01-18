/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strcapitalize.c                                 :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <jre-gonz@student.42madrid.com>   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/01/18 11:19:53 by jre-gonz          #+#    #+#             */
/*   Updated: 2022/01/18 11:21:29 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

int	is_alphanumeric(char c)
{
	if (c >= '0' && c <= '9')
		return (1);
	if (c >= 'a' && c <= 'z')
		return (1);
	if (c >= 'A' && c <= 'Z')
		return (1);
	return (0);
}

char	*ft_strlowcase(char *str)
{
	int	i;

	i = 0;
	while (str[i] != '\0')
	{
		if (str[i] >= 'A' && str[i] <= 'Z')
			str[i] += 32;
		i++;
	}
	return (str);
}

char	capitalize(char *str)
{
	if (str[0] >= 'a' && str[0] <= 'z')
		str[0] -= 32;
	return (str[0]);
}

char	*ft_strcapitalize(char *str)
{
	char	prev;
	int		i;

	ft_strlowcase(str);
	if (!str[0])
		return (str);
	prev = capitalize(str);
	i = 1;
	while (str[i])
	{
		if (!is_alphanumeric(prev) && is_alphanumeric(str[i]))
			capitalize(&str[i]);
		prev = str[i];
		i++;
	}
	return (str);
}
